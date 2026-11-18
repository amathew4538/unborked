func power(_ a:Int,_ b:Int)->Int {
    (0..<b).reduce(1) {
        $0 * a
    }
}

print(power(2,8)); print(power(3,4))
