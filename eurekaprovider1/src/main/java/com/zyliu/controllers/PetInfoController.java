package com.zyliu.controllers;

import com.zyliu.beans.PetBean;
import com.zyliu.util.StringUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/5/2.
 */
@RestController
public class PetInfoController {
    @GetMapping(value="/petinfo/findpet")
    public PetBean findPet() {
        PetBean petBean = new PetBean();
        petBean.setBreedType(new StringUtil().changeString("聪明机灵小柴犬"));
        petBean.setAge(1);
        petBean.setPrice(50000);
        return petBean;
    }
}
