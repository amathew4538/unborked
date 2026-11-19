use std::env;
fn main(){let a:Vec<String>=env::args().skip(1).collect();let (x,y,z)=if a.len()>=3{(a[0].parse().unwrap_or(8.0),a[1].chars().next().unwrap_or('+'),a[2].parse().unwrap_or(2.0))}else{(8.0,'+',2.0)};let r=match y{'+'=>x+z,'-'=>x-z,'*'=>x*z,'/' if z!=0.0=>x/z,_=>{println!("invalid expression");return}};println!("{x} {y} {z} = {r}");}
