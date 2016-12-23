function getjson(){
	$.ajax({url:"localhost:8080/jun/getjson",
		type:"GET",
			async:false,
			success:function(re){
				for (var i in re){
					alert(re[i]);
				}
			}
	}
			)
}