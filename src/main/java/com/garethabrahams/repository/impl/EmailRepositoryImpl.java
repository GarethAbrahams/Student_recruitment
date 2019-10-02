//package com.garethabrahams.repository.impl;
//
//import com.garethabrahams.model.Contact;
//import com.garethabrahams.model.Email;
//import com.garethabrahams.repository.ContactRepository;
//import com.garethabrahams.repository.EmailRepository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class EmailRepositoryImpl implements EmailRepository {
//
//    private static EmailRepositoryImpl repository = null;
//    private Set<Email> emailSet;
//
//    private EmailRepositoryImpl(){
//        this.emailSet = new HashSet<>();
//    }
//
//    public static EmailRepositoryImpl getRepository(){
//        if (repository==null)
//            repository = new EmailRepositoryImpl();
//
//        return repository;
//    }
//
//    @Override
//    public Set<Email> getAll() {
//        return this.emailSet;
//    }
//
//    @Override
//    public Email create(Email e) {
//        this.emailSet.add(e);
//        return e;
//    }
//
//    @Override
//    public Email update(Email e) {
//        Email oldResult = read(e.getEmailID());
//        if(oldResult != null) {
//            delete(oldResult.getEmailID());
//            create(e);
//            return e;
//        }
//        return null;
//    }
//
//    @Override
//    public void delete(String e) {
//        Email result = read(e);
//        this.emailSet.remove(result);
//    }
//
//    @Override
//    public Email read(String e) {
//        for (Email email : this.emailSet){
//            if (email.getEmailID().equals(e))
//                return email;
//        }
//        return null;
//    }
//}
