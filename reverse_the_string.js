const inputSentence = prompt("Enter a sentence:");

const words = inputSentence.split(' ');

const reversedWords = words.map(word => {
    return word.split('').reverse().join('');
});

const reversedSentence = reversedWords.join(' ');

console.log("Reversed Sentence: " + reversedSentence);
