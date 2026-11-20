fn main() {
    let mut records = vec![("Ada", 12u32), ("Lin", 21u32)];
    records.sort_by_key(|record| record.1);
    println!(
        "feature=MemoryPadding records={:?} heap_bytes={}",
        records,
        records.len() * std::mem::size_of::<(&str, u32)>()
    );
}
