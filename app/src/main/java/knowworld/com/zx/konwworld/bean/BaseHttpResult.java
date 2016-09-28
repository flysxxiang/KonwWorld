package knowworld.com.zx.konwworld.bean;

/**
 * @author fly_xiang_mac
 * @description 基础返回类实体
 * @time 2016-09-19
 */
public class BaseHttpResult<T> {
    private int showapi_res_code;
    public String showapi_res_error;
    private T showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public T getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(T showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }
}
