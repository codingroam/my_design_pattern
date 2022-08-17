package com.company.chain_responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author wangkai
 * @Date 2022/8/17 22:57
 */
public class ServletMain {

    public static void main(String[] args) {
        Request request = new Request("hi,<script>,大家都是996");
        Response response = new Response("Response");
        FilterChain filterChain = new FilterChain().add(new HtmlFilter()).add(new SensitiveFilter());
        filterChain.doFilter(request,response);
        System.out.println(request.msg);
        System.out.println(response.msg);


    }

    static class Request{
        String msg;

        public Request(String msg) {
            this.msg = msg;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
    static class Response{
        String msg;

        public Response(String msg) {
            this.msg = msg;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

    interface Filter{
        void doFilter(Request request,Response response,FilterChain filterChain);
    }

    static class HtmlFilter implements Filter{

        @Override
        public void doFilter(Request request, Response response, FilterChain filterChain) {
            request.msg = request.msg.replace("<","[").replace(">","]");
            filterChain.doFilter(request,response);
            response.msg = response.msg+"--HtmlFilter";
        }
    }

    static class SensitiveFilter implements Filter{

        @Override
        public void doFilter(Request request, Response response, FilterChain filterChain) {
            request.msg = request.msg.replace("996","995");
            filterChain.doFilter(request,response);
            response.msg = response.msg+"--SensitiveFilter";
        }
    }

    static class FilterChain{
        private int index = 0;
        List<Filter>  filters = new ArrayList<>();
        public FilterChain add(Filter filter){
            filters.add(filter);
            return this;
        }

        public void doFilter(Request request, Response response) {
            if(index == filters.size()){
                return ;
            }

            Filter filter = filters.get(index);
            index++;
            filter.doFilter(request,response,this);


        }
    }


}
