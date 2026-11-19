use std::env;
fn main(){let limit=env::args().nth(1).and_then(|x|x.parse().ok()).unwrap_or(30);let mut prime=vec![true;limit+1];prime[0]=false;if limit>0{prime[1]=false}for i in 2..=((limit as f64).sqrt() as usize){if prime[i]{let mut n=i*i;while n<=limit{prime[n]=false;n+=i}}}print!("primes:");for i in 2..=limit{if prime[i]{print!(" {i}")}}println!();}
