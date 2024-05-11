// Escribe tu código aquí.
const myArray = ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio'];
function bigWords(input, array) 
{
    return array.filter(word => word.length > input.length);
}

function printArray(array) 
{
    const ul = document.getElementById('resultList');
    ul.innerHTML = ''; 
    array.forEach(word => {
        const li = document.createElement('li');
        li.textContent = word;
        ul.appendChild(li);
    });
}

function handleClick() 
{
    const userInput = document.getElementById('userInput').value;
    const filteredArray = bigWords(userInput, myArray);
    printArray(filteredArray);
}

document.getElementById('submitButton').addEventListener('click', handleClick);
