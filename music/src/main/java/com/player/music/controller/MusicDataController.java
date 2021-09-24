package com.player.music.controller;

import com.player.music.po.PlayerResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MusicData")
public class MusicDataController {

    @RequestMapping("/query")
    public PlayerResult query(){
        return PlayerResult.ok();
    }
}
