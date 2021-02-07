package com.switches.mechswitchapi.Repository;

import org.springframework.data.repository.CrudRepository;
import com.switches.mechswitchapi.Entity.Switch;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface SwitchRepository extends CrudRepository<Switch, Integer> {

}
