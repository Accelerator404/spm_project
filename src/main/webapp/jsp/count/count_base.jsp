<%@ page language="java" import="java.util.*" contentType="text/html;  charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/common/taglibs.jsp" %>
<title>IT项目管理</title>
<frameset rows="22.8%,*,8.8%" border="0">
		<frame src="${ctx }/jsp/top.jsp">
		<frameset cols="22%,*" border="0">
			<frame src="${ctx }/jsp/left.jsp">
			<frame src="${ctx }/jsp/count/count.jsp">
		</frameset>
		<frame src="${ctx}/jsp/footer.jsp">
</frameset>