protocol Exporting{func export()->String}
struct CSVReport:Exporting{let rows:Int;func export()->String{"csv_rows=\(rows)"}}
let report:Exporting=CSVReport(rows:128);print(report.export())
