package com.garethabrahams.repository.Impl;

import com.garethabrahams.model.LoginAccounts.Username;
import com.garethabrahams.repository.UsernameRepository;

import java.util.HashSet;
import java.util.Set;

public class UsernameRepositoryImpl implements UsernameRepository {

    private static UsernameRepositoryImpl repository = null;
    private Set<Username> usernames;

    //HashSet - Store in memory
    private UsernameRepositoryImpl() {

        this.usernames = new HashSet<>();
    }

    public static UsernameRepositoryImpl getRepository(){
        if(repository==null)
            repository = new UsernameRepositoryImpl();

        return repository;
    }

    public Username usernameSearch(final String u){
        for (Username username: this.usernames){
            if (username.getUsername().equals(u))
                return username;
        }
        return null;
    }

    @Override
    public Set<Username> getAll() {
        return this.usernames;
    }

    @Override
    public Username create(Username e) {
        this.usernames.add(e);
        return e;
    }

    @Override
    public Username update(Username e) {
        Username usernameOld = usernameSearch(e.getUsername());
        if (usernameOld != null){
            Username usernameNew = new Username.Builder()
                    .copy(e)
                    .build();
            return create(usernameNew);
        }
        return null;    }

    @Override
    public void delete(String s) {
        this.usernames.remove(s);
    }

    @Override
    public Username read(String s) {
        return usernameSearch(s);
    }
}
