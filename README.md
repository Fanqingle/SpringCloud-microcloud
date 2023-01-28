# SpringCloud-microcloud
http://provider-dept-8001:8001/swagger-ui
http://provider-dept-8001:8001/provider/dept/list
curl "http://provider-dept-8001:8001/provider/dept/split?cp=1&ls=2&col=dname&kw="
http://provider-dept-8001:8001/provider/dept/add?dname=教学研发部2&loc=洛阳
curl -X POST -d "http://provider-dept-8001:8001/provider/dept/add"
http://provider-dept-8001:8001/provider/dept/get/1
http://provider-dept-8001:8001/provider/dept/get/10

http://consumer-springboot-80/swagger-ui
http://consumer-springboot-80/consumer/dept/list
http://consumer-springboot-80/consumer/dept/split?cp=1&ls=2&col=dname&kw=
http://consumer-springboot-80/consumer/dept/add?dname=教学研发部&loc=洛阳
http://consumer-springboot-80/consumer/dept/add
http://consumer-springboot-80/consumer/dept/get?deptno=1
http://consumer-springboot-80/consumer/dept/list


Content type &#39;application/x-www-form-urlencoded;charset=UTF-8&#39; not supported
