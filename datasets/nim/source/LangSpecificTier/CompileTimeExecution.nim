proc square(value:int):int = value*value
const compileValue = square(7)
echo "compile_time=", compileValue, " runtime=", square(12)
