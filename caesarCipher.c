#include <stdio.h>
#include <string.h>

char* caesarCipher(char* text, int shift)
{
    int i;
    int n = strlen(text);
    char* cipher = malloc(n + 1);

    for (i = 0; i < n; i++)
    {
        
        cipher[i] = (text[i] - 'A' + shift) % 26 + 'A';
    }
    cipher[n] = '\0'; 

    return cipher;
}

int main()
{
    char* text = "ATLAS";
    int shift = 3;
    char* cipher = caesarCipher(text, shift);
    printf("Ciphertext: %s\n", cipher);
    return 0;
}