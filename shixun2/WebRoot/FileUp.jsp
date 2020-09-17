<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <title>Layui</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>

<body>

 <p>
   name:<input type="text" id="name">
   文件：<input type="file" id="file" onchange="btu()">
   <br>
   <button id="btn" onclick="btu()">提交</button>
   <button id="btn" onclick="show()">展示</button>
 </p>




   <script src="vendors/jquery/dist/jquery.min.js"></script>
  <!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
  <script>
  var thumbnail="";
    function btu() {
      var name = $("#name").val();
      var file = $("#file")[0].files[0];//新特性，获取文件对象
      var fordata = new FormData();//新特性，得到formData对象，把获取的值扔进去，相当于map
      fordata.append("name", name);
      fordata.append("file", file);
      console.log(file)
      $.ajax({
        url: "UpdataFile",
        data: fordata,
        cache: false,
        processData: false, //必须写
        contentType: false, //必须写
        type: "post",
        success: function (data) {
        thumbnail=data;
        }
      })
    }


  </script>

</body>

</html>