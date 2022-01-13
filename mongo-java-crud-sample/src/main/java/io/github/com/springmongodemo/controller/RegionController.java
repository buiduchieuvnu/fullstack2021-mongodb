package io.github.com.springmongodemo.controller;

import io.github.com.springmongodemo.model.REGIONS;
import io.github.com.springmongodemo.repository.RegionRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.validation.Valid;
import java.util.List;

@RestController
@EnableSwagger2
@RequestMapping("/region")
public class RegionController {

    @Autowired
    private RegionRepository regionRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<REGIONS> getAllREGIONSs() {
        return regionRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public REGIONS getREGIONSById(@PathVariable("id") ObjectId id) {
        return regionRepository.findBy_id(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyREGIONSById(@PathVariable("id") ObjectId id, @Valid @RequestBody REGIONS REGIONS) {
        REGIONS._id = id;
        regionRepository.save(REGIONS);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public REGIONS createREGIONS(@Valid @RequestBody REGIONS REGIONS) {
        REGIONS._id = ObjectId.get();
        regionRepository.save(REGIONS);
        return REGIONS;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteREGIONS(@PathVariable ObjectId id) {
        regionRepository.delete(regionRepository.findBy_id(id));
    }
}
