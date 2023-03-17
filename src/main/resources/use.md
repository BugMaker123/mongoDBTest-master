https://note.youdao.com/ynoteshare/index.html?id=5e038498891617c552667b853742fdc1&type=note&_time=1678972002490

use admin

db.test1.find({name:"李时珍"})

db.test1.insert([
{"name":"阿里嘎多",
"school":"二次元集合",
"prof":"拍马屁"
}
]);

db.test1.insert([
{ name:"zhansan",
tag:["90","Programmer","PhotoGrapher"]
},
{  name:"lisi",
tag:["90","Accountant","PhotoGrapher"]
}]);

db.test1.find({school:"二次元集合"})

db.test1.find()