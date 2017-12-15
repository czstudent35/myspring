package cn.myspring.controller;

import cn.myspring.po.Item;
import cn.myspring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


/**
 * Created by user on 2017/12/12.
 */
@Controller
public class ItemController {
    @Resource
   private ItemService itemService;
    @RequestMapping("/queryItem.action")

    public ModelAndView findItemById(HttpServletRequest request)throws Exception{
       Item item= (Item) itemService.findItemById("11005");
        System.out.println("查询的数据为: " +item);
       ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("aa",item);
//        modelAndView.setViewName("showItem");
        modelAndView.setViewName("showItem");

        return modelAndView;





    }





}
