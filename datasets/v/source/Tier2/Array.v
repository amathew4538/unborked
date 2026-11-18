fn main() {
	values := [2,4,6,8,10]
	mut sum:=0

	for value in values {
		println(value); sum += value
	}

	println(sum)
}
