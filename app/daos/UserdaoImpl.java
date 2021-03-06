package daos;

import models.Home;
import models.User;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.Collection;
import java.util.List;

public class UserdaoImpl implements Userdao{

    final JPAApi jpaApi;


    @Inject
    public UserdaoImpl(JPAApi jpaApi) {
            this.jpaApi = jpaApi;
        }

        @Override
        public User create(User user) {
            if (null == user) {
                throw new IllegalArgumentException("user must be provided");
            }

            jpaApi.em().persist(user);
            return user;
    }

    @Override
    public User update(User user) {
        if(null == user){
            throw new IllegalArgumentException("user does not exist");
        }

        if(null == user.getUsername()){
            throw new IllegalArgumentException("UserName must be provided");
        }

        final User existingUser = findUserByName(user.getUsername());
        if(null == existingUser){
            throw new IllegalArgumentException("Invalid user");
        }

        existingUser.setName(user.getName());
        existingUser.setGender(user.getGender());
        existingUser.setDob(user.getDob());
        existingUser.setMobilenbr(user.getMobilenbr());
        existingUser.setAadharcard(user.getAadharcard());
        existingUser.setAddress((user.getAddress()));

        jpaApi.em().persist(existingUser);
        return existingUser;




    }

    @Override
    public User findUserByName(String username) {
        User user = null;
        try {
            TypedQuery<User> query = jpaApi.em().createQuery("SELECT u from User u WHERE  username = '" + username + "'", User.class);
            user = query.getSingleResult();
        }
        catch(NoResultException nre){

        }

        if(null == user){
            return null;
        }

        return user;

    }

    @Override
    public User findUserByAuthToken(String authToken) {
        User user = null;

        try {
            //LOGGER.debug("accessToken at find by level" + authToken);
            TypedQuery<User> query = jpaApi.em().createQuery("SELECT u from User u WHERE  u.accessToken = '" + authToken +"' ", User.class);

            user = query.getSingleResult();

        }
        catch(NoResultException nre){
            throw new IllegalArgumentException("Sign in to complete the action");
        }
        return user;

    }

    @Override
    public User updateaccessToken(User user) {
        if(null == user){
            throw new IllegalArgumentException("user does not exist");
        }

        if(null == user.getUsername()){
            throw new IllegalArgumentException("UserName must be provided");
        }

        final User existingUser = findUserByName(user.getUsername());
        if(null == existingUser){
            throw new IllegalArgumentException("Invalid user");
        }
        existingUser.setAccessToken(user.getAccessToken());


        jpaApi.em().persist(existingUser);
        return existingUser;


    }

    @Override
    public Collection<User> getUsers() {
        TypedQuery<User> query = jpaApi.em().createQuery("SELECT h FROM User h ", User.class);
        List<User> users = query.getResultList();
        return users;
    }


    @Override
    public User passiveUpdate(Integer id) {
        if(null == id) {
            throw new IllegalArgumentException("User Id must be provided");
        }


        final User existinguser = jpaApi.em().find(User.class, id);


        if(null == existinguser){
            throw new IllegalArgumentException("Invalid user");
        }

        existinguser.setStatus(User.Status.PASSIVE);


        jpaApi.em().persist(existinguser);
        return existinguser;

    }


}
