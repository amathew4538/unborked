use std::io::{self,BufRead};
fn main(){let mut state="IDLE";for line in io::stdin().lock().lines(){let c=line.unwrap_or_default();state=match (state,c.as_str()){("IDLE","deposit")=>"RUNNING",("RUNNING","pause")=>"PAUSED",("PAUSED","resume")=>"RUNNING",(_, "stop")=>"STOPPED",(_,_)=>state};println!("state: {state}");if state=="STOPPED"{break}}}
