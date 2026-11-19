fn adjust(values:&mut [i32],factor:i32){for value in values{*value*=factor;}}fn main(){let mut values=[2,3,5];adjust(&mut values,10);println!("values={:?}",values);}
