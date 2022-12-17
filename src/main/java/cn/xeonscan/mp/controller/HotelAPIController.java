package cn.xeonscan.mp.controller;

import cn.xeonscan.mp.pojo.Hotel;
import cn.xeonscan.mp.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
public class HotelAPIController {
    @Autowired
    private HotelService hotelService;
    @GetMapping("/hotel/{id}")
    public Object hotelAPIById(@PathVariable("id") int id, HttpServletResponse httpServletResponse) throws IOException {
        Hotel hotel;
        if((hotel = hotelService.selectById(id)) != null){
        Hotel[] hotels = new Hotel[1];
        hotels[0] = hotel;
            return hotels;
        }
        return "没有此酒店！";
    }
    @GetMapping("hotels")
    public List<Hotel> HotelAPIAll(){
        return hotelService.selectAll();
    }
}
