### Bônus de Git e GITHUB
## Conceito: *git* é um sistema  de versionamento, essas versões são controladas por "commits" e *Github* é o local onde vc hospeda seus projetos, para  que salvamos as versões , onde ficam as versões antigas e atual

## Repositório Remoto: Tipicamente uma copia oficial do repositorio fica salvo em um servidor 
## Respositório Local: Cada pessoa que trabalha no projeto pode fazer uma cópia do repositório para seu computador(repositorio local). A pessoa então faz suas alterações no projeto (novos commits) e depois salva as alterações no  servidor.
## comandos ==> git clone ou pull -> pega o repositorio remoto e coloca no local || git commit => adiciona texto e cria uma nova versão || git push => envia a versão novamente para o github

## git status vai mostrar arquivos que estao em stage

## git init => inicia um repositorio
## git banch -M main => coloco o nome main na minha branch


## clonar e atualizar repositorio
## git clone git@urlGit

## com o comando git log vemos os comits feitos

## git diff => mostra a diferença em arquivos modificados
## git checkout => permite modificar temporariamente os arquivos do projeto ao estado de um dado commit ou branch

## a cabeça do seu branch é seu head e o comando git checkout modifica de acordo com o id do commit
## ou seja o id q vc escolher vira o head
ou 
## git checkout HEAD~1 
## eu volto um commit abaixo do ultimo, ~*numero* eu escolho quantos commits eu volto 


## voltando para o commit anterior sem perder as alterações que ja fiz , ou seja desfaz o ultimo commit
## git reset --soft HEAD~1

## voltar o projeto ao estado de um dado commit
## git reset --hard *codigo do commit*
# exemplo voltando ao penultimo commit 
## git reset --hard HEAD~1


## atualizar o repositorio local  ao remoto
## git pull *nome do repositorio* *nome da branch*

## apontando projeto para outro repositorio 
## git remote set-url git@url


