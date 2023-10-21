function reverse(sentence) {
    return sentence.split(' ').map(word => word.split('').reverse().join('')).join(' ');
}
 
// For testing the above code ..... 
let example = "This is a sunny day";
let answer = reverse(example);
console.log(answer);
