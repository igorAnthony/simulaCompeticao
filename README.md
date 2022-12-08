# simulaCompeticao
 Criei um programa para o Trabalho 2 da disciplina de Introdução a Orientado a Objeto da UTFPR de Toledo, capaz de simular competições entre atletas de três modalidades distintas, sendo elas:
<br>• Ginástica
<br>• Natação
<br>• Halterofilismo
<br>Os atletas possuem diferentes atributos que definem o seu desempenho na competição. Além dos atributos, atletas podem possuir lesões decorrentes de seus treinamentos e
competições anteriores. A quantidade de lesões interfere negativamente no desempenho dos atletas. O desempenho dos atletas são simulados por fórmulas que consideram os atributos dos atletas em cada modalidade. O cálculo para cada modalidade deve ser realizado da seguinte forma:
<br>Desempenho dos ginastas:
<br>
d = 1 + (força * 0.6) + (resistência * 0.6) + (fôlego * 0.5) + (flexibilidade * 1.0) – (peso/100) - (nrLesões/10)
<br>Desempenho dos nadadores:
<br>d = 1 + (força * 0.5) + (resistência * 0.6) + (fôlego * 1.0) + (flexibilidade * 0.3) – (peso/100) - (nrLesões/10)
<br>Desempenho dos halterofilistas:
<br>d = 1 + (força * 1.0) + (resistência * 0.6) + (fôlego * 0.4) + (flexibilidade * 0.3) + (peso/100) - (nrLesões/10)
<br>As listas dos atletas estão disponíveis por meio de três arquivos JSON distintos. Cada arquivo contém os atletas que irão participar de cada uma das modalidades esportivas. 
<br>Os atletas contidos nos arquivos devem ser inscritos nas suas respectivas competições, sendo necessário cumprir os seguintes requisitos: 
<br>• Atletas entre 18 e 45 anos de idade (calculado no momento da simulação)
<br>• Não possuírem mais de 10 lesões
<br>Os atletas que cumprem os requisitos são incluídos na competição. Entretanto, os atletas não admitidos deverão ser excluídos da competição. Ao término da simulação, o programa gera um arquivo JSON para informar o resultado de cada modalidade. O nome do arquivo obedece o seguinte padrão: resultado-<modalidade>.json. Os atletas que não cumprem os requisitos para participar das competições são registrados em um arquivo JSON, que deve é nominado pelo padrão: inscricoes-negadas-<modalidade>.json.
