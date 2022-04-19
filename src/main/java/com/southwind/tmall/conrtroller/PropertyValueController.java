package com.southwind.tmall.conrtroller;

import com.southwind.tmall.pojo.Product;
import com.southwind.tmall.pojo.PropertyValue;
import com.southwind.tmall.service.ProductService;
import com.southwind.tmall.service.PropertyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PropertyValueController {
    @Autowired
    PropertyValueService propertyValueService;
    @Autowired
    ProductService productService;
    @GetMapping("/products/{pid}/propertyValues")
    public List<PropertyValue> list(@PathVariable("pid") int pid) throws Exception{
        Product product = productService.get(pid);
        propertyValueService.init(product);
        List<PropertyValue> list = propertyValueService.list(product);
        return list;
    }
//@GetMapping("/products/{pid}/propertyValues")
//public List<PropertyValue> list(@PathVariable("pid") int pid) throws Exception {
//    Product product = productService.get(pid);
//    propertyValueService.init(product);
//    List<PropertyValue> propertyValues = propertyValueService.list(product);
//    return propertyValues;
//}
    @PutMapping("/propertyValues")
    public Object update (@RequestBody PropertyValue bean) throws Exception{
        propertyValueService.update(bean);
        return bean;
    }

}
