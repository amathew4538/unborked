use std::sync::{Arc,Mutex};
use std::thread;
fn main() {
 let balance=Arc::new(Mutex::new(100));
 let mut workers=Vec::new();
 for _ in 0..4 { let copy=Arc::clone(&balance); workers.push(thread::spawn(move|| { *copy.lock().unwrap()+=25; })); }
 for worker in workers { worker.join().unwrap(); }
 println!("feature=DataRace balance={}",*balance.lock().unwrap());
}
