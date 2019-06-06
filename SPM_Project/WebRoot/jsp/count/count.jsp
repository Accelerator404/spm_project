<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/common/taglibs.jsp"%>
<% 
//----------------------------------------------------------------
 //Project: SPM System (Client SubSystem) 
// JSP Name  : footer.jsp 
// PURPOSE : 右边页面显示
// HISTORY：
//	Create：
//	Modify：Han Xinyu Xue yifei    2015.10.24
//  Copyright  : BUPTSSE   
//----------------------------------------------------------------- %>
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
	<head>
		<title>"教育部-IBM精品课程建设项目"软件项目管理课程</title>
		<link href="${ctx}/css/fontStyle.css" rel="stylesheet" type="text/css" />
		<link href="${ctx}/css/tableStyle2.css" rel="stylesheet" type="text/css" />
		<link href="${ctx}/css/picture.css" rel="stylesheet" type="text/css" />
		<link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
		<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
  <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
  <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${ctx}/js/picture.js"></script>
		<script type="text/javascript" src="${ctx}/js/count.js"></script>
		<style type="text/css">
		body {
		  margin-right: 100px;
		  margin-left:0px;
		  margin-top:10px;
		  margin-bottom:50px;
		  padding: 0;
		  overflow-x: hidden;
		}
		</style>
	</head>
	<body style="margin:0;">
	<a>跟踪用户模块执行次数</a>
	<p></p>
	<div class="btn-group">
                        <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="true"  ><span id="btnSelected">全部用户</span>
                    <span class="fa fa-caret-down"></span></button>

                <ul class="dropdown-menu"  id="btnUsers">
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="#"  id="all" color="#c43535">全部用户</a></li>

                </ul>

                </div>
	<div>
	<div class='row'>
	<div class='col-sm-8'><!-- 统计表格显示 -->
	<p id="loading" hidden style="font-size:20px;margin-left:50px">	<i class="fa fa-spinner"></i><span>加载中...</span></p>
		<table class='table '  border="1">
		
				<thead><tr>
						<th id='multicheck'  class='multioutuser'>编号</th>
					<th>模块名称</th>
						<th>执行次数</th>
						
						</tr>
					</thead>
					
					<tbody>
				<tr>
				<td>1</td>
				<td>首页</td>
				<td>0</td>
				</tr>
				
				<tr>
				<td>2</td>
				<td>行业信息</td>
				<td>0</td>
				</tr>
				
				<tr>
				<td>3</td>
				<td>下载专区</td>
				<td>0</td>
				</tr>
				
				<tr>
				<td>4</td>
				<td>选课</td>
				<td>0</td>
				</tr>
				
				<tr>
				<td>5</td>
				<td>成绩查询</td>
				<td>0</td>
				</tr>
				
				<tr>
				<td>6</td>
				<td>留言板</td>
				<td>0</td>
				</tr>
				
				<tr>
				<td>7</td>
				<td>网上测试</td>
				<td>0</td>
				</tr>
				
				<tr>
				<td>8</td>
				<td>联系我们</td>
				<td>0</td>
				</tr>
				
				<tr>
				<td>9</td>
				<td>登录</td>
				<td>0</td>
				</tr>
				</tbody>
				</table>
				
				</div>
				<div class="col-sm-4" hidden>
				<a>详细跟踪记录</a>
				<div id="details"  style='max-height:400px;border:dashed  gray 0.5px;overflow-y: auto'>
				<p>2019-05-21 20:13 访问了行业信息</p>
				<p>详细执行记</p>
				<p>详细执行记</p>
				<p>详细执行记</p>
				<p>详细执行记</p>
				<p>详细执行记</p>
				<p>详细执行记</p>
				<p>详细执行记</p>
				<p>详细执行记</p>
				<p>详细执行记</p>
				
				
				
				</div>
				</div>
	</div>
	
	
	</body>
</html>









