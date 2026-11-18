fn main() {
    let limit = 30;
    let mut prime = vec![true; limit + 1];
    prime[0] = false;
    prime[1] = false;

    for value in 2..=((limit as f64).sqrt() as usize) {
        if prime[value] {
            let mut multiple = value * value;
            while multiple <= limit {
                prime[multiple] = false;
                multiple += value;
            }
        }
    }

    print!("primes:");
    for (value, is_prime) in prime.iter().enumerate().skip(2) {
        if *is_prime { print!(" {}", value); }
    }
    println!();
}
