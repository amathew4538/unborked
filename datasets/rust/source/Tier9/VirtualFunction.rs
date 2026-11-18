trait Report { fn render(&self)->String; }
struct Inventory { items:i32 }
impl Report for Inventory { fn render(&self)->String { format!("items={}",self.items) } }
fn main() {
 let report:Box<dyn Report>=Box::new(Inventory{items:5});
 println!("feature=VirtualFunction report={}",report.render());
}
