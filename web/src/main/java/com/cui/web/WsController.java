package com.cui.web;

/**
 * Created by cjs
 * Date： 2017/7/20.
 * Time： 14:44.
 */
/*
@Controller
@RequestMapping("/chat")
public class WsController {
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    public void handleChat(Principal principal, String msg) {
        if (principal.getName().equals("sang")) {
            messagingTemplate.convertAndSendToUser("lenve", "/queue/notifications", principal.getName() + "给您发来了消息：" + msg);
        }else{
            messagingTemplate.convertAndSendToUser("sang", "/queue/notifications", principal.getName() + "给您发来了消息：" + msg);
        }
    }
    @RequestMapping("/massage")
    public  String index(){

        return "chat";
    }
}
*/
