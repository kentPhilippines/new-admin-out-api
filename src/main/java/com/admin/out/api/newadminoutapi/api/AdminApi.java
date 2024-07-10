package com.admin.out.api.newadminoutapi.api;

import com.admin.out.api.newadminoutapi.dao.domain.DealOrderApp;
import com.admin.out.api.newadminoutapi.dao.domain.RunOrder;
import com.admin.out.api.newadminoutapi.dao.domain.Withdraw;
import com.admin.out.api.newadminoutapi.dao.service.RunOrderService;
import com.admin.out.api.newadminoutapi.server.DealOrderAppBase;
import com.admin.out.api.newadminoutapi.server.RunOrderBase;
import com.admin.out.api.newadminoutapi.server.UserBase;
import com.admin.out.api.newadminoutapi.server.WithdrawBase;
import com.admin.out.api.newadminoutapi.vo.Result;
import com.admin.out.api.newadminoutapi.vo.page.ReqPage;
import com.admin.out.api.newadminoutapi.vo.page.ResPage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
@Slf4j
@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AdminApi {
    private final UserBase userBase;
    private final DealOrderAppBase dealOrderAppBase;
    private final RunOrderBase runOrderBase;
    private final WithdrawBase withdrawBase;
    @PostMapping("/orderdeal/page")
    public Result<ResPage<DealOrderApp>> orderappPage(@RequestBody @Valid ReqPage<DealOrderApp> vo) {
        log.info("adminApi with request:{}", vo.toString());
        ResPage<DealOrderApp> userInfoResponseVoResPage = dealOrderAppBase.queryPage(vo);
        return Result.ok(userInfoResponseVoResPage);
    }
    @PostMapping("/orderdeal/list")
    public Result<List<DealOrderApp>> list(@RequestBody @Valid DealOrderApp vo) {
        log.info("adminApi with request:{}", vo.toString());
        List<DealOrderApp> userInfoResponseVoResPage = dealOrderAppBase.queryList(vo);
        return Result.ok(userInfoResponseVoResPage);
    }
    @PostMapping("/rurnning/page")
    public Result<ResPage<RunOrder>> pageRunOrder(@RequestBody @Valid ReqPage<RunOrder> vo) {
        log.info("adminApi with request:{}", vo.toString());
        ResPage<RunOrder> runOrderResPage = runOrderBase.queryPage(vo);
        return Result.ok(runOrderResPage);
    }
    @PostMapping("/rurnning/list")
    public Result<List<RunOrder>> list(@RequestBody @Valid RunOrder vo) {
        log.info("adminApi with request:{}", vo.toString());
        List<RunOrder> userInfoResponseVoResPage = runOrderBase.queryList(vo);
        return Result.ok(userInfoResponseVoResPage);
    }

    @PostMapping("/orderWit/page")
    public Result<ResPage<Withdraw>> listWit(@RequestBody @Valid ReqPage<Withdraw> vo) {
        log.info("adminApi with request:{}", vo.toString());
        ResPage<Withdraw> runOrderResPage = withdrawBase.queryPage(vo);
        return Result.ok(runOrderResPage);
    }
    @PostMapping("/orderWit/list")
    public Result<List<Withdraw>> page(@RequestBody @Valid Withdraw vo) {
        log.info("adminApi with request:{}", vo.toString());
        List<Withdraw> userInfoResponseVoResPage = withdrawBase.queryList(vo);
        return Result.ok(userInfoResponseVoResPage);
    }
}
