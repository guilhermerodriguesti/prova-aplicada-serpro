const prompt = require('prompt-sync')({ sigint: true });

// insira as linhas da sua resposta, imediatamente a partir desta linha

function calculaFatorial() {
    const numeroDigitado = parseInt(prompt('Digite um número entre 0 e 100:'));
    
    if (numeroDigitado >= 0 && numeroDigitado <= 100) {
        let numeroFatorial = 1;
        for (let i = 1; i <= numeroDigitado; i++) {
            numeroFatorial *= i;
        }
        console.log(`O fatorial do número ${numeroDigitado} é ${numeroFatorial}`);
    } else {
        console.log("Erro. O número digitado deve ser maior ou igual a 0 e menor ou igual a 100.");
    }
}

calculaFatorial();
