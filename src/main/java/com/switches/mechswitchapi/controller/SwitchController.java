package com.switches.mechswitchapi.controller;

import com.switches.mechswitchapi.entity.Switch;
import com.switches.mechswitchapi.repository.SwitchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class SwitchController {

    @Autowired
    private SwitchRepository switchRepository;

    @PostMapping(value = "/createSwitch")
    public String addNewSwitch (@RequestBody Switch inputSwitch) {
        switchRepository.save(inputSwitch);
        return "Saved";
    }

    @GetMapping(value = "/switch/getAllSwitches")
    public @ResponseBody Iterable<Switch> getAllSwitches() {
        return switchRepository.findAll();
    }
}
