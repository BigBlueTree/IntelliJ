package com.shop.controller;

import com.shop.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value="/thymeleaf")
public class ThymeleafExController {
    @GetMapping(value="/ex01")
    public String thymeleafExam01(Model model){
        model.addAttribute("data","타임리프예제");
        return "thymeleafEx/thymeleafEx01";
    }

    @GetMapping(value="/ex02")
    public String thymeleafExam02(Model model){
        ItemDto itemDto = new ItemDto();
        itemDto.setItemDetail("상품의 상세한 설명");
        itemDto.setItemNm("더미 상품");
        itemDto.setPrice(10000);
        itemDto.setRegTime(LocalDateTime.now());

        model.addAttribute("itemDto",itemDto);
        return"thymeleafEx/thymeleafEx02";
    }

    @GetMapping(value="/ex03")
    public String thymeleafExam03(Model model){
        List<ItemDto> itemDtoList=new ArrayList<>();
        for(int i=1;i<=10;i++){
            ItemDto itemDto = new ItemDto();
            itemDto.setItemNm("더미 상품"+i);
            itemDto.setItemDetail("더미 상품 정보"+i);
            itemDto.setPrice(1000*i);
            itemDto.setRegTime(LocalDateTime.now());
            itemDtoList.add(itemDto);
        }
        model.addAttribute("itemDtoList",itemDtoList);
        return "thymeleafEx/thymeleafEx03";
    }

    @GetMapping(value="/ex04")
    public String thymeleafExam04(Model model){
        List<ItemDto> itemDtoList=new ArrayList<>();
        for(int i=1;i<=5;i++){
            ItemDto itemDto = new ItemDto();
            itemDto.setItemNm("더미 상품"+i);
            itemDto.setItemDetail("더미 상품 정보"+i);
            itemDto.setPrice(1000*i);
            itemDto.setRegTime(LocalDateTime.now());
            itemDtoList.add(itemDto);
        }
        model.addAttribute("itemDtoList",itemDtoList);
        return "thymeleafEx/thymeleafEx04";
    }

    @GetMapping(value="/ex05")
    public String thymeleafExam05(){
        return "thymeleafEx/thymeleafEx05";
    }

    @GetMapping(value="/ex06")
    public String thymeleafExam06(String param1,String param2,Model model){
        model.addAttribute("param1",param1);
        model.addAttribute("param2",param2);
        return "thymeleafEx/thymeleafEx06";
    }

    @GetMapping(value="/ex07")
    public String thymeleafExam07(){
        return "thymeleafEx/thymeleafEx07";
    }
}


