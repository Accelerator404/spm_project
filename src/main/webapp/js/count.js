$(document).ready(function(){
	getUsers()
	data={"uid":""}
	getCountinfo(data)
	
	//案件绑定
	$(document).on('click',"#btnUsers a",function(){
		$("#btnSelected").text($(this).text())
		data={"uid":$(this).attr("value")}
		getCountinfo(data)
	})
	//模拟数据，应当使用getCounginfo(data)来加载统计数据，这里可以删除
//	result={'1':14,'2':12}
//	$("tbody tr").each(function(){
//		var mid_sel = $(this).children("td:eq(0)")
//		var mcount_sel = $(this).children("td:eq(2)")
//		var mid=mid_sel.text()
//		mcount_sel.text(result[mid])
//	})
	
	$("#details").html("")//加载全部数据，则清空跟踪记录
	
})
 function getCountinfo(data){//默认加载一次，拿到全部统计数据、全部用户
	$("table").attr("hidden",true)
	$("#loading").removeAttr("hidden")
	var url="${ctx}/getCountInfo.do";
	$.ajax({
		url:url,
		data:data,
		type:"GET",
		dataType:"JSON",
		success:function(result){
			$("#loading").attr("hidden",true)
			$("table").removeAttr("hidden")
			
			$("tbody tr").each(function(){
				var mid_sel = $(this).children("td:eq(0)")
				var mcount_sel = $(this).children("td:eq(2)")
				var mid=mid_sel.text()
				if (mid in result){
					mcount_sel.text(result[mid])
				}else{
					mcount_sel.text("0")
				}
				
			})
		}
	})
 
 }
function getUsers(){//默认获取一次所有用户
	var url="${ctx}/getAllUser.do";
	$.ajax({
		url:url,
		type:"GET",
		dataType:"JSON",
		success:function(result){
			toUsers = "<li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\"  id=\"all\" color=\"#c43535\" value=''>全部用户</a></li>"
				for(i in result){//这里在按钮上存用户名，在按钮的标签里存uid,即value部分
					toUsers+="<li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\"  id=\"all\" color=\"#c43535\" value="+i+">"+result[i]+"</a></li>"
				}
				$("#btnUsers").html(toUsers)
		}
	})
	//result={'1':1,'2':'uname'}//键是uid,值是用户名
	
}
 