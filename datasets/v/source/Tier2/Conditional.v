fn classify(n int) string {
	if n < 0 {
		return 'negative'
	}

	if n > 0 {
		return 'positive'
	}

	return 'zero'
}

fn main() {
	println(classify(-1))
	println(classify(0))
	println(classify(1))
}
