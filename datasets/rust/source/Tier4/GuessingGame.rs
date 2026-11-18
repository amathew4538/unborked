use std::io::{self,BufRead};
fn main(){println!("Guess a number from 1 to 100");let target=42;for (i,line) in io::stdin().lock().lines().enumerate().take(8){let guess=line.unwrap_or_default().trim().parse().unwrap_or(50);if guess==target{println!("Correct in {} attempts",i+1);return}println!("{}",if guess<target{"Too low"}else{"Too high"});}println!("Out of guesses");}
