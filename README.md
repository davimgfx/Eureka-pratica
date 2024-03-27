Link do repositório: https://github.com/davimgfx/Eureka-pratica

# Atividade Pratica Eureka
Primeira atividade Prática de Sistemas Distríbuidos utilizando o Eureka.

## Orientações Práticas
 
- Reforçando que a implementação deverá ser feita em Java.
 
### Atividade

Desafio: Implementar serviço de soma distribuída no Eureka.
Desenho de solução abaixo.

1. Através do Insomnia ou Postman, efetuar chamada REST a APP A solicitando uma soma de valores aleatórios

2. APP A deverá então chamar a APP B, que por sua vez chamará a APP C

3. APP C retornará um número aleatório para a APP B

4. APP B irá somar este valor com um valor aleatório que ela gerar e retornar para APP A, que por sua vez retornará para o Insomnia

5. Antes de cada chamada, APP A -> APP B e APP B -> APP C, elas deverão checar se as mesmas estão ativas. Caso não estejam deverá ser retornado o valor -1 caso a APP B falhe e -2 caso a APP C falhe.

6. Nenhuma URL de serviço deverá ser codificada. Todo o processo deverá ser gerenciado pelo Service Registry do Eureka
 
7. Caso queiram criar mais serviços, endpoints e etc, serão considerados e a depender de cada caso valem nota extra

No total deverão ser criadas no mínimo quatro aplicações:
   1. App Eureka Server
   2. APP A (Eureka Client)
   3. APP B (Eureka Client)
   4. APP C (Eureka Client)
