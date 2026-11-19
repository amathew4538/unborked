struct Point:Equatable{var x:Int;var y:Int}
var a=Point(x:2,y:3);var b=a;b.x=9;print("a=(\(a.x),\(a.y)) b=(\(b.x),\(b.y))")
