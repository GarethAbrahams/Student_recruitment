package com.garethabrahams.repository;

public interface IRepository<Entity, EntityID> {
    Entity create(Entity e);
    Entity update(Entity e);
    void delete(EntityID id);
    Entity read(EntityID id);
}
