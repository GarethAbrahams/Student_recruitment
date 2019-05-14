package com.garethabrahams.service;

public interface IService <Entity, EntityID>{
    Entity create(Entity e);
    Entity read(EntityID id);
    Entity update(Entity e);
    void delete(EntityID id);
}
