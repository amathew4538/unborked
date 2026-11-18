#[derive(Debug)]
enum State { Idle, Running, Paused, Stopped }

fn main() {
    let states = [State::Idle, State::Running, State::Paused, State::Stopped];
    for state in states {
        println!("state: {:?}", state);
    }
}
