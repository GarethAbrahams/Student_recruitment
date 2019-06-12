package com.garethabrahams.repository.General.Impl;

import com.garethabrahams.model.General.Password;
import com.garethabrahams.repository.General.PasswordRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("PasswordRepository")
public class PasswordRepositoryImpl implements PasswordRepository {

    private static PasswordRepositoryImpl repository = null;
    private Set<Password> passwords;

    //HashSet - Store in memory
    private PasswordRepositoryImpl() {

        this.passwords = new HashSet<>();
    }

    public static PasswordRepositoryImpl getRepository(){
        if(repository==null)
            repository = new PasswordRepositoryImpl();

        return repository;
    }

    public Password passwordSearch(final String p){
        for (Password password: this.passwords){
            if (password.getPassword().equals(p))
                return password;
        }
        return null;
    }

    @Override
    public Set<Password> getAll() {
        return this.passwords;
    }

    @Override
    public Password create(Password e) {
        this.passwords.add(e);
        return e;
    }

    @Override
    public Password update(Password e) {
        Password passwordOld = passwordSearch(e.getPassword());
        if (passwordOld != null){
            Password passwordNew = new Password.Builder()
                    .copy(e)
                    .build();
            return create(passwordNew);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.passwords.remove(s);
    }

    @Override
    public Password read(String s) {
        return passwordSearch(s);
    }
}
