fn main(){let a=[[1,2,3],[4,5,6]];let b=[[7,8],[9,10],[11,12]];for r in 0..2{for c in 0..2{let n:i32=a[r].iter().zip(0..3).map(|(x,k)|x*b[k][c]).sum();print!("{n}{}",if c==1{"\n"}else{" "});}}}
