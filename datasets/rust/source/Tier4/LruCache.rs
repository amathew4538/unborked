use std::collections::HashMap;
fn main(){let mut cache=HashMap::from([('A',1),('B',2),('C',3)]);println!("cache: {:?}",cache);cache.remove(&'B');println!("get B: miss");cache.insert('D',4);println!("put D=4: {:?}",cache);}
