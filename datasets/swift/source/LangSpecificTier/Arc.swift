import Foundation
final class Session{var name:String;init(_ name:String){self.name=name};deinit{print("session deallocated")}}
var session:Session?=Session("build");print("session=\(session!.name)");session=nil
