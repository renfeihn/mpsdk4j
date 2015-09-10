package io.github.elkan1788.mpsdk4j.api;

import io.github.elkan1788.mpsdk4j.vo.menu.Menu;

import java.util.List;

/**
 * 微信自定义菜单接口
 * 
 * @author 凡梦星尘(elkan1788@gmail.com)
 * @since 2.0
 */
public interface CustomMenuAPI {

    // 菜单查询地址
    static String query_menu = "/menu/get?access_token=";
    // 菜单创建地址
    static String create_menu = "/menu/create?access_token=";
    // 菜单删除地址
    static String del_menu = "/menu/delete?access_token=";

    /**
     * 查询当前自定菜单
     * 
     * @return 菜单项
     */
    List<Menu> getMenu();

    /**
     * 创建自定义菜单
     * 
     * @param menu
     *            菜单项
     * @return true 或 false
     */
    boolean createMenu(Menu... menu);

    /**
     * 删除自定义菜单
     * 
     * @return true 或 false
     */
    boolean delMenu();
}
