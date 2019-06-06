//$(document).ready(function(){
//		  var un="${session.user.userName}"
//			var un ='1'
//			  console.log(un)
//			  var url ="/SPM_Project/saveUserCount.do";
//			  
//			 $('.over').click(function(){
//				 var click_item = $(this).text()	
//				 var li_list = $("li")
//				 for (i = 0;i<li_list.length;i++){
//					 var v = $("ul li:eq("+i+")").find("span:eq(0)").text()
//					 if( v == click_item && i<9){
//						 index = i+1;
//						 var data={"username":un,"mid":index}
//						 $.ajax({
//							 url:url,
//							 type:"GET",
//							 data:data,
//							 success:function(){}
//						 })
//						 console.log(index);//拿到了下标
//					 }
//				 }
//			
//			 })
//			
//		  })